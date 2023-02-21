<template>



<form id="form" @submit="checkForm">

    <label for="login">Nom : </label>
    <input id="login" name="login" type="text" placeholder="Entrez un nom..." v-model="nom">
    <p></p>
    <input type="submit" value="Play">


</form>
</template>

<script>

    export default {
    name: 'LoginPage',

    data(){
        return {
            nom:null,
        };
    },

    methods: {
        checkForm(e){
            //stocke dans le store
            this.$store.commit("setLeUser", this.nom)
            console.log(this.$store.getters.getLeUser)

            this.$router.push({name: "home", params: { lenom: this.nom}})

            e.preventDefault();
        },
    },

    };


</script>
