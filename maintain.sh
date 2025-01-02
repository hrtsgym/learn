#!/bin/bash
# この行はシェバン（shebang）で、スクリプトがbashで実行されることを示します。

MD_DIR=../../../sugiyama_ha/diary
PULL_CMD="git pull origin master"

#sampleプロジェクトをpullする
$PULL_CMD

#diaryプロジェクトに移動する
cd $MD_DIR
#diaryプロジェクトをpullする
$PULL_CMD
