#!/bin/bash
# この行はシェバン（shebang）で、スクリプトがbashで実行されることを示します。

MD_DIR=../../../sugiyama_ha/diary
PULL_CMD="git pull origin master"
PUSH_CMD="git push origin master"

$PULL_CMD
$PUSH_CMD

cd $MD_DIR

$PULL_CMD
