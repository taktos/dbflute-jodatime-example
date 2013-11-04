DBFlute + Joda-Time example
===========================

DBFluteを使って、DatabaseのDATE型をJoda-TimeのLocalDateにマッピングするサンプル。

## やっていること
- typeMappingMapでJDBCのDATE型をorg.joda.time.LocalDateに紐付け
- org.joda.time.LocalDateとjavax.sql.Dateを相互に変換するValueTypeを作成
- DBFluteInitializerを継承して、カスタムのValueTypeを登録
- DBFluteInitializerの拡張クラスをlittleAdjustmentMapで設定
- ConditionBeanの日付型FromTo検索がLocalDateに対応しないため、自動生成から除外するようincludeQueryMapで設定


※mydbfluteを.gitignoreに追加しているため、DBFluteのコード生成を行う場合は mvn dbflute:download を実行してランタイムをダウンロードしてから行ってください
