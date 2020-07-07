前端以MV为主
MVC（同步通信为主）
MVP（异步通信为主）
MVVM（异步通信为主）

angular.js  -> 模块化开发
react.js -> 虚拟DOM

Vue.js就是一个MVVM的实现者 他的核心就是实现了  DOM监听  与  数据绑定

Vue有  7大对象: el  data  method  template  methods  render  computed  watch
            8大方法: 
            7个指令: 

**1.v-bind**: v-开头的都被称做指令(操作)      等于 :       v-bind:itemm="item"    :itemm="item"
**2&3.v-if  v-else v-else-if v-for**
            关于数组和对象中参数顺序的解释：
                    1.所有的循环，首要目的都是为了获取元素的值
                    2.其次是元素的键
                    3.最后是元素的索引

**4.事件**: 方法必须定义在Vue的methods对象中
v-on  e.g. v-on:click=""//具体可以查jQuery关于事件的文档    等于@   v-on:click="doSomething"    缩写 -->  @click="doSomething"

**5.双向绑定**:  数据发生改变, 视图也会发生改变
                视图发生改变, 数据也会发生改变
v-model 

注意: v-model会忽略所有表单元素的value checked selected特性的初始值, 并且改为为Vue实例的数据

**6.Vue组件**
Vue.component("name",{
        props: ["bind_name"],
        template: "<>template</>"
});
v-bind:定义的接收参数="v-for遍历的参数"                v-bind:形参="实参"
组件传递给组件中的值
父组件向子组件传值，需要用props: []接收                     v-slot:header   =  #header
子传父，则需要用$emit()发送

**7.Vue生命周期**(从创建到销毁的过程)
            开始创建、数据初始化(created)、编译模板、(beforemount)挂载DOM、渲染、(beforeUpdate)更新、渲染、(beforeDestroy)销毁
            Vue生命周期8个阶段对应钩子函数：创建前/后 ，载入前/后 ，更新前/后 ，销毁前/后
简单说一下常用钩子函数适合哪些运用场景
    beforeCreate 此时页面开始创建 ，可以加loading……事件 ，加载实列时触发
    created 数据 一些异步请求的调用 ，loading……事件结束等
    mounted 获取Dom节点操作DOM ，在这个钩子函数里面我们可以使用一些第三方的插件实例写在这个函数内
    updated 做一些数据统一更新处理的相应函数

> *important:  data(){return: .. }返回一份数据的副本，没有直接操作源数据( data: funtion(){}  )*
            *this._options.data().message 是私有属性，不能访问*
            *this.$options.data().message 只能展示初始化时的数据*
            *this.$data.message === this.message 都能传值取值*

el是Vue实例的挂载目标。在实例挂载之后，元素可以用 vm.$el 访问。
> el是目标, 后面的操作用$el替代

**8.计算属性** 

```javascript
computed: {
    属性名: function(){
                //最好别和函数重名，重名了只调用函数，用不了计算属性
                //Vue的特色，相当于缓存，里面东西不变，只计算一次，一开始就计算
            }, ...
    }
```
9.插槽 slot
        相当于开了个口子，2个插槽开2个口子，可以在View层去写口子做什么
<slot name="name"></> ===占位符
        事件分发：使用自定义事件   this.$emit('自定义事件名', 参数)       //emit 发射 v.

$emit("kebab-case", 参数);    只能全小写中间用-隔开



https://www.cnblogs.com/tandaxia/p/12142018.html
