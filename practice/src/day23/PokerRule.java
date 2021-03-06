package day23;

public class PokerRule {
/*
Card class 기능 : 카드 1장의 정보를 나타내는 클래스
CardPack class 기능 : 카드 1팩의 정보를 나타내는 클래스 52장의 1팩

- 기능
cardPack() : 새로운 카드팩을 생성하고 카드팩 섞음
cardPackSetAll() : 새로운 카드팩을 만드는 메서드
cardPackSet : 모양이 주어지면 해당 모양의 1번 카드부터 k카드까지 팩에 추가
show() : 현재 카드팩 내용을 보여주는 메서드
shuffle() : 카드팩을 섞는 메서드
give() : 카드팩에서 한장을 꺼내는 메서드

//user 와 dealer 를 생성해서 user와 dealer에게 카드 7장씩 나눠주는 코드

//카드 나눠주는 규칙
- 우선 3장을 받고 한장을 공개한 후, 공개한 카드의 숫자가 더 큰
사람에게 먼저 나눠준다.
- 숫자가 동일한 경우 스페이스 > 다이아 > 하트 > 클로버순이다.
- 다음 카드는 마지막에 받은 카드를 기준으로 다시 순서를 정한다.

//포커규칙
- 탑 : 아래 중 하나라도 만족하는 경우가 없는 경우
		코드의 재사용 줄이기 , 속도
- 원페어 : 숫자가 같은 카드가 2장이고 한셋인 경우
		ex) 1, 1

- 투페어 : 숫자가 같은 카드가 2장이고 두셋이상인 경우
		ex) 7, 7 && k, k && q, q

- 트리플 : 숫자가 같은 카드가 3장이고 한셋인 경우
		ex) 9, 9, 9

- 포커 : 숫자가 같은 카드가 4장인 경우 (경우의 수가 1개뿐임)
		ex) 1, 1, 1, 1

- 스트레이트 : 연속된 숫자가 5장이상인  경우
		ex) 5, 6, 7, 8, 9

- 백스트레이트 : 1부터 시작하여 5까지 스트레이트
		ex) 1, 2, 3, 4, 5
 
- 마운틴 : 10에서 시작하여 1까지 스트레이트
		ex) 10, j, q, k, 1

- 플러쉬 : 같은 모양의 카드가 5장 이상인 경우
		ex) S1, S4, S9, S8, S0

- 풀하우스 : 트리플 + 원페어, 트리플 2개
		ex) 9, 9, 9 + 1, 1
		ex) 9, 9, 9 && 10, 10, 10

- 스트레이트 플러쉬 : 모양이 같은 5장의 카드의 숫자가 연속적인 경우
		ex) S3, S4, S5, S6, S7
 */
}
