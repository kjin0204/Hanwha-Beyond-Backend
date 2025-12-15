import {createRouter, createWebHashHistory, createWebHistory} from 'vue-router';
import HomeView from '@/views/01_router/HomeView.vue';
import PathVariable from '@/views/01_router/PathVariable.vue';
import QueryString from '@/views/01_router/QueryString.vue';

/* routes: 배열 형태로 요청과 컴포넌트 매칭
path: client 요청 경로
compnet: 맵핑할 컴포넌트
*/
const router = createRouter({
    // history: createWebHashHistory(),
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            component: HomeView
        },
        {
            /* pathvariable 형태의 라우팅은 경로상의 값을 받아줄 변수를 작성하는 형태로 설정해야 한다. */
            path: '/pathvariable/:id',
            component: PathVariable
        },
        {
            path: '/queryString',       // ?뒤로 들어오는 queryString 자동 맵핑
            component: QueryString
        }

    ]
});

export default router;