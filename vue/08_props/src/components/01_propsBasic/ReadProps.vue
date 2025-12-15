<template>
    <h1>{{ props.readValue }}</h1>
    <label>자식의 readValue:</label>
    <input type="text" v-model="props.readValue">
    <hr>
    
    <label >test = {{ test }}</label>
    <input type="text" v-model="test">
</template>

<script setup>
    import {defineProps, ref} from 'vue';
    const props = defineProps({
        readValue: String
    })
    const test = ref(props.readValue);
    
</script>

<style scoped>

</style>