yieldUnescaped '<!DOCTYPE html>'
html {
    head {
        title('Spring Boot - Groovy templates example')
        link(rel: 'stylesheet', href: '/css/bootstrap.min.css')
    }
    body {
        div(class: 'container') {
            div(class: 'navbar') {
                div(class: 'navbar-inner') {
                    a(class: 'brand',
                            href: 'http://beta.groovy-lang.org/docs/groovy-2.3.2/html/documentation/markup-template-engine.html',
                            'Groovy - Template Engine docs(groovy模板引擎文档链接)')

                }

                div(class: 'navbar-inner') {
                    a(class: 'brand',
                            href: 'hhttp://projects.spring.io/spring-boot/') {
                        yield 'Spring Boot docs(spring boot 文档链接)'
                    }

                }
            }
            div("这是后台返回的信息:${hello}")
        }
    }
}