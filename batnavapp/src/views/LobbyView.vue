<template>

<Titre msg="lobby"/>
<NavigationBar></NavigationBar>

</template>

<script>
import NavigationBar from '@/components/Navigation/NavigationBar.vue';
import Titre from '@/components/Titre.vue';
export default {

name: "LobbyView",
components:{
    Titre,
    NavigationBar
},


}

</script>