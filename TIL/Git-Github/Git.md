20-08-07
# Git
* Git 의 탄생
    * 리누스 토발즈가 git이라는 버전관리 시스템을 만듬 
* Git의 특징
    * 빠른속도, 단순한 구조
    * 분산형 저장소 지원
    * 비선형적 개발가능 
* 장점
    * 소스코드 주고받기 없이 동시작업이 가능해서 생산성이 증가
    * 수정내용들은 commit단위로 관리/배포 그리고 원하는 시점으로 checkout도 가능 
    * Branch를 이용해 새로운 기능을 추가할수있고, 성공적으로 개발이 완료되면 Merge하여 반영
    * 인터넷에 연결이 되어있지 않아도 개발가능
* 클라이언트
    * git GUI
    * sourcetree
    * kraken
    * smartGit
* Git objects
    * Blob: 파일 하나의 내용에 대한 정보
    * Tree: Blob이나 subtree의 메타데이터(디렉토리 위치/속성/이름)        
    * Commit: 커밋 순간의 스냅샷 
* Set configuration\
terminal

        $ git config --global user.name "{github username}"
        $ git config --global user.email "{github email address}"
        $ git config --global core.editor "vim"
        $ git config --global core.pager "cat"
        $ git config --list
* Commit Convention
    * 커밋 제목은 50자 이내로 요약
    * 제목과 내용사이 한 칸
    * prefix 를 사용해 한눈에 커밋의 용도를 알한다
## Start Project with git clone
### clone
* github 에서 repository를 생성
    
        $ git clone {repository address}
        $ git add .
        $ git commit
        $ git push
