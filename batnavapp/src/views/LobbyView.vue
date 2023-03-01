<template>

<Titre msg="Lobby"/>
<NavigationBar></NavigationBar>

<Partie></Partie>

</template>

<script>
import NavigationBar from '@/components/Navigation/NavigationBar.vue';
import Partie from '@/components/Partie.vue';
import Titre from '@/components/Titre.vue';
export default {

name: "LobbyView",
components:{
    Titre,
    NavigationBar,
    Partie
},


}

</script>