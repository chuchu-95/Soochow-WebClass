const app = Vue.createApp({
    data(){
        return{
            userName : 'chuchu',
            school : ['SuChoow', 'OtherU'],
            schoolLink : 'http://www.suda.edu.cn',
            count : 0
        }
    },
    methods: {
        outputSex() {
            const randomNumber = Math.random();
            return randomNumber < 0.5?this.school[0] : this.school[1];
        },
        getContent() {
            return '<h2>Welcome</h2>'
        }
    },

}).mount('#myVue')