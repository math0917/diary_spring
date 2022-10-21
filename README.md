[1일차](#1-일차)
[2일차](#2-일차)
[3일차](#3-일차)
[4일차](#4-일차)
[5일차](#5-일차)
[6일차](#6-일차)

# 1 일차
### erd 생성 v1
### Spring Entity 생성 v1

# 2 일차
### Picture를 서버 실행과 동시에 static 폴더에 넣어두기로 결정 

# 3 일차
### Member entity v2 
기존의 Already와의 연관관계를 제거하고 테스트 코드 작성
### repository를 생성
springdatajpa가 제공해주는 기능이 아닌걸 querydsl로 작성하려다 끝마침 -- 다음작업

# 4 일차
### MemberService 구현 중 문제발생 
객체들끼리의 행동을 정의하지 않아서 인지 각각의 service가 어떠한 행동을 가져야 할지 정의가 되지 않는다...

# 5 일차 
### 갈아엎자!!!!!!!!!!! 천천히 service로 어떠한 interface를 제공할지부터 


# 6 일차 
### 제공할 기능을 재정의
### Service 파트부터 정의를 하고, Repsoitory를 적용 그 후 Controller를 연결 v1
모든 기능을 구현하는 것이 아닌 일부만 우선 구
