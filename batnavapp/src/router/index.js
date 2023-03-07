import { createRouter, createWebHashHistory } from 'vue-router'
import LoginView from '../views/LoginView.vue'
import HomeView from '../views/HomeView.vue'
import LobbyView from '../views/LobbyView.vue'
import GameView from '../views/GameView.vue'


const routes = [
  {
    path: '/',
    name: 'login',
    component: LoginView
  },
  {
    path: '/:lenom/home',
    name: 'home',
    component: HomeView
  },
  {
    path: '/:lenom/lobby',
    name: 'lobby',
    component: LobbyView
  },
  {
    path: '/:lenom/game',
    name: 'game',
    component: GameView
  },

  
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
