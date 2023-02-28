<template>
    
    <router-link class="nav-link" :to="{ name: nom}">{{ label }}</router-link>

</template>

<script>
export default {
    name: "NavigationPage",
    props:{
        nom:String,
        label:String
    },

}
</script>