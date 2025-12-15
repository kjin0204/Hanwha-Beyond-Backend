<template>
    <div>
        <h3>전달 받은 proprs: {{ props.message }} {{ props.count }}</h3>
    </div>
    <br>
    <!-- <button @click="test123"></button> -->
</template>

<script setup>
    /* 1. 기본 자료형 (Primitive Types) */
    // const props = defineProps({
    //     message: String,
    //     count: Number,
    //     isActive: Boolean,
    //     items: Array,
    //     user: Object,
    //     createdAt: Date,
    //     callback: Function,
    //     id: Symbol
    // });


    /* 2. 여러 타입 허용 */
    // const props = defineProps({
    //     value: [String, Number],
    //     data: [Array, Object]
    // });
    // const test123 = () => {props.message = '123'}

    import {defineProps} from 'vue'
    const props = defineProps({
        message : String,
        count : Number
    });
</script>

<style scoped>

</style>