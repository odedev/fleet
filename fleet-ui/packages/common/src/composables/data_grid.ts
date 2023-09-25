import {ref, toValue, watchEffect, onMounted, onUnmounted} from 'vue'
import type {Ref} from 'vue';


export function usePageSize(
  tableBodyElement: Ref<HTMLDivElement | undefined>,
  pageSize: number,
  rowHeight: number = 40,
  headHeight: number = 40
): Ref<number> {
  const size = ref<number>(toValue(pageSize));
  const pageSizeValue = toValue(pageSize);
  let handle: any;

  function getRows() {
    const tableBodyElementValue = toValue(tableBodyElement);
    console.log(tableBodyElementValue?.getBoundingClientRect())

    const rect = tableBodyElementValue?.getBoundingClientRect();
    const height = rect?.height??(100 + headHeight);
    const rowsHeight = height - headHeight;
    const rows = Math.floor(rowsHeight / rowHeight);
    size.value = rows??pageSizeValue;

    // if (handle) {
    //   clearTimeout(handle)
    // }
    // handle = setTimeout(() => {
    //   console.log(tableBodyElementValue?.getBoundingClientRect())
    //
    //   const rect = tableBodyElementValue?.getBoundingClientRect();
    //   const height = rect?.height??(100 + headHeight);
    //   const rowsHeight = height - headHeight;
    //   const rows = Math.floor(rowsHeight / rowHeight);
    //   size.value = rows??pageSizeValue;
    // }, 200);
  }

  onMounted(() => {
    getRows();
    window.addEventListener('resize', getRows);
  });

  onUnmounted(() => {
    window.removeEventListener('resize', getRows);
  });

  return size;
}


export function usePageValue(
  data: any[],
  pageData: Ref<any[]> | any[],
  pageNum: Ref<number> | number,
  pageSize: Ref<number> | number,
  pageCount: Ref<number> | number | undefined
) {
  const pageValue = ref<any[]>();

  watchEffect(() => {
    const pageDataValue = toValue(pageData);
    const pageNumValue = toValue(pageNum);
    const pageSizeValue = toValue(pageSize);
    const pageCountValue = toValue(pageCount);

    const start = (pageNumValue - 1) * pageSizeValue;
    const end = pageNumValue * pageSizeValue;

    // 对数据初始化
    // 总条数 或 所有数据 有值
    if (data.length === 0 && (pageDataValue.length > 0 || !!pageCountValue)) {
      if (!pageCountValue || pageCountValue === pageDataValue.length) {
        data = pageDataValue;
      } else {
        data = new Array(pageCountValue).fill(null, 0, pageCountValue);
      }
    }

    // 传入的数据为已分页的数据
    if (data.length && data.length > pageDataValue.length) {
      for (let i = start; i < end; i++) {
        const index = i - start;
        if (data[i] && data[i].id === pageDataValue[index].id) {
          continue;
        }
        data[i] = pageDataValue[index]??null;
      }
    }

    console.log(data)

    pageValue.value = data.slice(start, end);
  });


  return pageValue;
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

export function usePageData(data: any[], pageData: any[], pageNum: number, pageSize: number, count: number) {
  const pageValue = ref<any[]>();

  watchEffect(() => {
    const pageDataValue = toValue(pageData);
    const pageNumValue = toValue(pageNum);
    const pageSizeValue = toValue(pageSize);
    const totalValue = toValue(count);

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

