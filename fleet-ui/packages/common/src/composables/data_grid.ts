import { ref, toValue, watchEffect, onMounted } from 'vue'

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


export function usePageSize(boxElement: HTMLDivElement, pageSize: number, rowHeight: number = 40) {
  const boxElementValue = toValue(boxElement);
  const pageSizeValue = toValue(pageSize);
  const rowHeightValue = toValue(rowHeight);
  const size = ref<number>(pageSizeValue);

  onMounted(() => {
    const rect = boxElementValue?.getBoundingClientRect();
    const rows = Math.floor(rect?.height / rowHeightValue) - 1;
    size.value = pageSizeValue??rows;
  });

  return size;
}
