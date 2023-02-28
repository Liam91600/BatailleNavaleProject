<template>
    
    <router-link class="nav-link" :to="{ name: nom}" style="margin : 0px 50px;">{{ label }}</router-link>

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