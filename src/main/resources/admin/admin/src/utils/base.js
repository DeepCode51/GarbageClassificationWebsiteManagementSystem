const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot574f8/",
            name: "springboot574f8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot574f8/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "垃圾分类网站"
        } 
    }
}
export default base
