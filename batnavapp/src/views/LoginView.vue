<template>

<Titre msg="Bienvenue sur le jeu officiel de la Bataille Navale" />
<Login/>

</template>

<script>
// @ is an alias to /src
import Titre from '@/components/Titre.vue';
import Login from '@/components/Login.vue';

export default {
  name: 'LoginView',
  components: {
    Titre,
    Login
}
}
</script>
