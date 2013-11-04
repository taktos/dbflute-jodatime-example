DBFlute + Joda-Time example
===========================

DBFluteを使って、DatabaseのDATE型をJoda-TimeのLocalDateにマッピングするサンプル。

## やっていること
Joda-Timeとのマッピングに必要な設定は df4474ba6ac506551ac89ee3d7254271b75a2c42 に含まれています。
- `typeMappingMap`でJDBCのDATE型を`org.joda.time.LocalDate`に紐付け
- `org.joda.time.LocalDate`と`javax.sql.Date`を相互に変換するValueTypeを作成
- DBFluteInitializerを継承して、カスタムのValueTypeを登録
- DBFluteInitializerの拡張クラスを`littleAdjustmentMap`で設定
- ConditionBeanの日付型FromTo検索がLocalDateに対応しないため、自動生成から除外するよう`includeQueryMap`で設定


※mydbfluteを.gitignoreに追加しているため、DBFluteのコード生成を行う場合は`mvn dbflute:download`を実行してランタイムをダウンロードしてから行ってください
