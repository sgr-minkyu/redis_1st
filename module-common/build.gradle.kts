dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.github.ben-manes.caffeine:caffeine:3.1.2")
    implementation("com.querydsl:querydsl-jpa:5.0.0:jakarta")
    implementation("org.springframework.boot:spring-boot-starter-cache")
    kapt("com.querydsl:querydsl-apt:5.0.0:jakarta")

}