<!-- 다른 파일을 불러올 때는 상대경로(./) 또는 src부터의 경로인 절대경로(@)를 사용할 수 있다. -->
<script setup>
  // 상대 경로 접근
  // import MyComponent from './components/01_componet/MyComponent.vue';

  // 절대 경로 (src 경로 부터 시작 @ <- src 위치 가 됨)
  import MyComponent from '@/components/01_componet/MyComponent.vue';
  import SlotParent from '@/components/02_slotintro/SlotParent.vue';
  import NamedParent from './components/03_namedslot/NamedParent.vue';
  import DynamicParent from './components/04_dynamicslot/DynamicParent.vue';

</script>
    
<template>
  <header>
    <div class="redColor">
      <MyComponent></MyComponent>
    </div>
  </header>
  <main>
    <SlotParent></SlotParent>
    <NamedParent></NamedParent>
    <DynamicParent></DynamicParent>
  </main>

</template>



<style scoped>
  .redColor {
    color : red;
  }
</style>
