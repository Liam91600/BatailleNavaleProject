<template>

<div id="Navig">
        <nav><h4>

            <Navigation nom="home" label="Home"/>
            <span> - </span>
            <Navigation nom="lobby" label="Jouer"/>
            <span> - </span>
            <Navigation nom="login" label="Quitter"/>

        </h4></nav>

    </div>
    
</template>

<script>
import Navigation from './Navigation.vue';

export default {

    name: "BarreNavigation",
    components:{
    Navigation
    },


}
</script>