<template>
    <div>
        <slot :data="pLanguages"></slot>
    </div>
</template>
<script src="https://cdn.jsdelivr.net/npm/vue@2.6.11/dist/vue.min.js"></script>

<script>
    Vue.component ("my-cpn",{
        template: "todo2",
        data(){
            return{
                pLanguage:[
                    'java','python','spring','scala'
                ]
            }
        }
    });
</script>
<style scoped>

</style>