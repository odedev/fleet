import {ref, toValue, watchEffect, onMounted, onUnmounted} from 'vue'
import type {Ref} from 'vue';


export function usePageSize(
    tableBodyElement: Ref<HTMLDivElement | undefined>,
    pageSize: number,
    rowHeight: number = 40,
    headHeight: number = 40): Ref<number> {
  const size = ref<number>(toValue(pageSize));
  const pageSizeValue = toValue(pageSize);

  function getRows() {
    const tableBodyElementValue = toValue(tableBodyElement);
    const rect = tableBodyElementValue?.getBoundingClientRect();
    const height = rect?.height??(100 + headHeight);
    const rowsHeight = height - headHeight;
    const rows = Math.floor(rowsHeight / rowHeight);
    size.value = rows??pageSizeValue;
    console.log(rect)

  }

  onMounted(() => {
    getRows()
    window.addEventListener('resize', getRows)
  });

  onUnmounted(() => {
    window.removeEventListener('resize', getRows)
  });

  return size;
}

export function usePageSizes(boxDOMRect: DOMRect, pageSize: number, rowHeight: number = 40, headHeight: number = 40) {
  const size = ref<number>(toValue(pageSize));
  watchEffect(() => {
    const rect = toValue(boxDOMRect);
    const pageSizeValue = toValue(pageSize);
    const rowHeightValue = toValue(rowHeight);
    const rows = Math.floor(rect?.height / rowHeightValue) - 1;
    size.value = rows??pageSizeValue;
    console.log(size.value)
  })

  return size;
}

export function usePageData(data: any[], pageData: any[], pageNum: number, pageSize: number, total: number) {
  const pageValue = ref<any[]>();

  watchEffect(() => {
    const pageDataValue = toValue(pageData);
    const pageNumValue = toValue(pageNum);
    const pageSizeValue = toValue(pageSize);
    const totalValue = toValue(total);

    const start = (pageNumValue - 1) * pageSizeValue;
    const end = pageNumValue * pageSizeValue;

    if (!data.length && totalValue) {
      data.fill(null, 0, totalValue);
    }

    if (pageDataValue.length === totalValue) {
      pageDataValue.forEach((item, index) => {
        data[index] = item;
      })
    }

    if (pageDataValue.length < totalValue) {
      for (let i = start; i < end; i++) {
        const index = i - start;
        data[i] = pageDataValue[index]??null;
      }
    }

    pageValue.value = data.slice(start, end);
  })

  return {
    data,
    pageData: pageValue
  }
}

