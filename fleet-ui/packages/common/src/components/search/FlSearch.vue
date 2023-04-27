<template>
  <section class="search">
    <div class="search-parameter">
      <input type="text" name="" id="">
      <input type="number" name="" id="">
    </div>
    <div class="search-action">
      <button>搜索</button>
      <button>重置</button>
    </div>
  </section>
</template>

<script lang="ts" setup>

</script>

<style lang="scss">
.search {
  width: 100%;
  display: flex;
  flex-direction: row;
  padding: 16px;

  .search-parameter {
    width: 100%;
    height: 100%;
    flex-basis: 100%;
    flex-grow: 1;
    flex-shrink: 1;
    display: flex;
    flex-direction: row;
  }
  .search-action {
    width: 120px;
    height: 100%;
    flex-basis: 120px;
    flex-grow: 0;
    flex-shrink: 0;
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
  }
}
</style>
