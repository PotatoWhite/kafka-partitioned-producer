# Kafka Partitioned Producer

## 첫째 날

1. Kafka를 통해 메시지를 전달하는 두 시스템 간에 처리 지연이 발생 함

### 대응

1. 분석 01
    - 특정 Data가 Topic에 발행된지 약 한시간 후 DBMS에 적재 되는 것이 발견 됨
    - 해당 프로세스에서 Kafka를 통해 Message를 교환하고 있음을 파악함
2. 대응 01
    - Consumer측의 Application Instance를 2->4로 Scaleout
    - Message의 지연상황을 확인하기 위해 모니터링
3. 분석 02
    - Consumer Scale-out은 효과가 없었음
    - Kafka Topic 설정을 확인 해보니 Topic이 단일 partition을 사용하고 있음
    - Kafka Topic의 Partition을 늘리기 위해서는 Topic을 지우고 다시 만들어야 함
    - Topic을 지울 경우 해당 Topic에 쌓여 있는 Message들이 유실 됨
4. 대응 02
    - 우선 단일 Partition의 빠른 처리를 위해서 Kafka Listener를 비동기로 처리 함


## 둘째 날

1. 원인을 알수 없는 Data로 인한 민원이 발생함
    - 예를 들어 특정 Table의 Record가 일부 Field만 채워져서 등록이 되어있었다.

### 대응
