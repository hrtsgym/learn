#!/bin/bash
# この行はシェバン（shebang）で、スクリプトがbashで実行されることを示します。

MD_DIR=../../../sugiyama_ha/diary
CMD="git pull origin master"

$CMD

cd $MD_DIR

$CMD
