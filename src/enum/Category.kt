package enum

enum class Category(val value: String) {
    MATHEMATICS("수학"),
    IMPLEMENTATION("구현"),
    DYNAMIC_PROGRAMMING("다이나믹 프로그래밍"),
    GRAPH_THEORY("그래프 이론"),
    DATA_STRUCTURES("자료 구조"),
    STRING("문자열"),
    GREEDY("그리디 알고리즘"),
    BRUTEFORCING("브루트포스 알고리즘"),
    GRAPH_TRAVERSAL("그래프 탐색"),
    SORTING("정렬"),
    GEOMETRY("기하학"),
    NUMBER_THEORY("정수론"),
    TREE("트리"),
    SEGMENT_TREE("세그먼트 트리"),
    BINARY_SEARCH("이분 탐색"),
    BREADTH_FIRST_SEARCH("너비 우선 탐색"),
    AD_HOC("애드 혹"),
    SIMULATION("시뮬레이션"),
    ARITHMETIC("사칙연산"),
    DEPTH_FIRST_SEARCH("깊이 우선 탐색"),
    CONSTRUCTIVE("구성적"),
    COMBINATORICS("조합론"),
    PREFIX_SUM("누적 합"),
    BITMASK("비트마스킹"),
    CASE_WORK("많은 조건 분기"),
    DIJKSTRAS("데이크스트라"),
    SET_MAP_BY_HASHING("해시를 사용한 집합과 맵"),
    PARSING("파싱"),
    BACKTRACKING("백트래킹"),
    SWEEPING("스위핑"),
    DISJOINT_SET("분리 집합"),
    SET_MAP_BY_TREES("트리를 사용한 집합과 맵"),
    DIVIDE_AND_CONQUER("분할 정복"),
    PRIORITY_QUEUE("우선순위 큐"),
    STACK("스택"),
    DYNAMIC_PROGRAMMING_ON_TREES("트리에서의 다이나믹 프로그래밍"),
    TWO_POINTER("두 포인터"),
    PRIMALITY_TEST("소수 판정"),
    MAXIMUM_FLOW("최대 유량"),
    GAME_THEORY("게임 이론"),
    SEGMENT_TREE_WITH_LAZY_PROPAGATION("느리게 갱신되는 세그먼트 트리"),
    DYNAMIC_PROGRAMMING_USING_BITFIELD("비트필드를 이용한 다이나믹 프로그래밍"),
    PARAMETRIC_SEARCH("매개 변수 탐색"),
    EXPONENTIATION_BY_SQUARING("분할 정복을 이용한 거듭제곱"),
    ARBITRARY_PRECISION_BIG_INTEGERS("임의 정밀도 / 큰 수 연산"),
    PROBABILITY_THEORY("확률론"),
    OFFLINE_QUERIES("오프라인 쿼리"),
    RECURSION("재귀"),
    PRECOMPUTATION("런타임 전의 전처리"),
    KNAPSACK("배낭 문제"),
    SIEVE_OF_ERATOSTHENES("에라토스테네스의 체"),
    BIPARTITE_MATCHING("이분 매칭"),
    VALUE_COORDINATE_COMPRESSION("값 / 좌표 압축"),
    MINIMUM_SPANNING_TREE("최소 스패닝 트리"),
    EUCLIDEAN_ALGORITHM("유클리드 호제법"),
    HASHING("해싱"),
    TOPOLOGICAL_SORTING("위상 정렬"),
    LOWEST_COMMON_ANCESTOR("최소 공통 조상"),
    FLOYD_WARSHALL("플로이드–워셜"),
    LINEAR_ALGEBRA("선형대수학"),
    CONVEX_HULL("볼록 껍질"),
    INCLUSION_AND_EXCLUSION("포함 배제의 원리"),
    STRONGLY_CONNECTED_COMPONENT("강한 연결 요소"),
    SPARSE_TABLE("희소 배열"),
    TRIE("트라이"),
    FAST_FOURIER_TRANSFORM("고속 푸리에 변환"),
    MINIMUM_COST_MAXIMUM_FLOW("최소 비용 최대 유량"),
    SMALLER_TO_LARGER_TECHNIQUE("작은 집합에서 큰 집합으로 합치는 테크닉"),
    GEOMETRY_3D("3차원 기하학"),
    LCP_SUFFIX_ARRAY_AND_LCP_ARRAY("접미사 배열과 lcp 배열"),
    RANDOMIZATION("무작위화"),
    CALCULUS("미적분학"),
    DEQUE("덱"),
    MEET_IN_THE_MIDDLE("중간에서 만나기"),
    KMPKNUTH_MORRIS_PRATT("kmp"),
    SLIDING_WINDOW("슬라이딩 윈도우"),
    CONVEX_HULL_TRICK("볼록 껍질을 이용한 최적화"),
    LINE_SEGMENT_INTERSECTION_CHECK("선분 교차 판정"),
    SPRAGUE_GRUNDY_THEOREM("스프라그–그런디 정리"),
    SQUARE_ROOT_DECOMPOSITION("제곱근 분할법"),
    EULER_TOUR_TECHNIQUE("오일러 경로 테크닉"),
    HEAVY_LIGHT_HEAVY_LIGHT_DECOMPOSITION("heavy-light 분할"),
    CENTROID("센트로이드"),
    LONGEST_INCREASING_SEQUENCE_IN_O("가장 긴 증가하는 부분 수열: o(n log n)"),
    GAUSSIAN_ELIMINATION("가우스 소거법"),
    PYTHAGORAS_THEOREM("피타고라스 정리"),
    CENTROID_DECOMPOSITION("센트로이드 분할"),
    MAX_FLOW_MIN_CUT_THEOREM("최대 유량 최소 컷 정리"),
    PERMUTATION_CYCLE_DECOMPOSITION("순열 사이클 분할"),
    EULERIAN_PATH_CIRCUIT("오일러 경로"),
    TERNARY_SEARCH("삼분 탐색"),
    QUEUE("큐"),
    ARTICULATION_POINTS_AND_BRIDGES("단절점과 단절선"),
    BIT_SET("비트 집합"),
    HEURISTICS("휴리스틱"),
    _2_SAT("2-sat"),
    PERSISTENT_SEGMENT_TREE("퍼시스턴트 세그먼트 트리"),
    PHYSICS("물리학"),
    MODULAR_MULTIPLICATIVE_INVERSE("모듈로 곱셈 역원"),
    CACTUS("선인장"),
    _0_1_BFS("0-1 너비 우선 탐색"),
    CHINESE_REMAINDER_THEOREM("중국인의 나머지 정리"),
    LINEARITY_OF_EXPECTATION("기댓값의 선형성"),
    BICONNECTED_COMPONENT("이중 연결 요소"),
    FERMATS_LITTLE_THEOREM("페르마의 소정리"),
    MOS("mo's"),
    DIVIDE_AND_CONQUER_OPTIMIZATION("분할 정복을 사용한 최적화"),
    EULER_TOTIENT_FUNCTION("오일러 피 함수"),
    BELLMAN_FORD("벨만–포드"),
    POINT_IN_CONVEX_POLYGON_CHECK("볼록 다각형 내부의 점 판정"),
    SPLAY_TREE("스플레이 트리"),
    PLANAR_GRAPH("평면 그래프"),
    AREA_OF_A_POLYGON("다각형의 넓이"),
    EXTENDED_EUCLIDEAN_ALGORITHM("확장 유클리드 호제법"),
    BERLEKAMP_MASSEY("벌래캠프–매시"),
    PARALLEL_BINARY_SEARCH("병렬 이분 탐색"),
    AHO_CORASICK("아호-코라식"),
    LINKED_LIST("연결 리스트"),
    MULTIDIMENSIONAL_SEGMENT_TREE("다차원 세그먼트 트리"),
    REGULAR_EXPRESSION("정규 표현식"),
    ROTATING_CALIPERS("회전하는 캘리퍼스"),
    TRAVELLING_SALESMAN_PROBLEM("외판원 순회 문제"),
    EULER_CHARACTERISTIC("오일러 지표 (χ=v-e+f)"),
    MÖBIUS_INVERSION("뫼비우스 반전 공식"),
    RABIN_KARP("라빈–카프"),
    LINKCUT_TREE("링크/컷 트리"),
    DYNAMIC_PROGRAMMING_USING_CONNECTION_PROFILE("커넥션 프로파일을 이용한 다이나믹 프로그래밍"),
    MERGE_SORT_TREE("머지 소트 트리"),
    MANACHERS("매내처"),
    DYNAMIC_PROGRAMMING_USING_A_DEQUE("덱을 이용한 다이나믹 프로그래밍"),
    BIPARTITE_GRAPH("이분 그래프"),
    MILLER_RABIN("밀러–라빈 소수 판별법"),
    TREE_ISOMORPHISM("트리 동형 사상"),
    SLOPE_TRICK("함수 개형을 이용한 최적화"),
    PIGEONHOLE_PRINCIPLE("비둘기집 원리"),
    OFFLINE_DYNAMIC_CONNECTIVITY("오프라인 동적 연결성 판정"),
    NUMERICAL_ANALYSIS("수치해석"),
    CIRCULATION("서큘레이션"),
    HALLS_THEOREM("홀의 결혼 정리"),
    POLLARD_RHO("폴라드 로"),
    LINEAR_PROGRAMMING("선형 계획법"),
    HUNGARIAN("헝가리안"),
    ALIENS_ALIENS_TRICK("aliens 트릭"),
    DUAL_GRAPH("쌍대 그래프"),
    POINT_IN_NON_CONVEX_POLYGON_CHECK("오목 다각형 내부의 점 판정"),
    VORONOI_DIAGRAM("보로노이 다이어그램"),
    MATROID("매트로이드"),
    DISCRETE_LOGARITHM("이산 로그"),
    MINIMUM_ENCLOSING_CIRCLE("최소 외접원"),
    STATISTICS("통계학"),
    DUALITY("쌍대성"),
    GENERAL_MATCHING("일반적인 매칭"),
    BURNSIDES_LEMMA("번사이드 보조정리"),
    LUCAS_THEOREM("뤼카 정리"),
    KNUTH_OPTIMIZATION("크누스 최적화"),
    KITAMASA("키타마사"),
    DOMINATOR_TREE("도미네이터 트리"),
    PALINDROME_TREE("회문 트리"),
    Z("z"),
    BIDIRECTIONAL_SEARCH("양방향 탐색"),
    HALF_PLANE_INTERSECTION("반평면 교집합"),
    STABLE_MARRIAGE_PROBLEM("안정 결혼 문제"),
    UTF_8_INPUTS("utf-8 입력 처리"),
    BAYES_THEOREM("베이즈 정리"),
    ROPE("로프"),
    MONOTONE_QUEUE_OPTIMIZATION("단조 큐를 이용한 최적화"),
    SIMULATED_ANNEALING("담금질 기법"),
    TREE_COMPRESSION("트리 압축"),
    GENERATING_FUNCTION("생성 함수"),
    TREE_DECOMPOSITION("트리 분할"),
    DELAUNAY_TRIANGULATION("델로네 삼각분할"),
    STOER_WAGNER("스토어–바그너"),
    GEOMETRY_HYPERDIMENSIONAL("4차원 이상의 기하학"),
    DISCRETE_SQUARE_ROOT("이산 제곱근"),
    HIRSCHBERGS("히르쉬버그"),
    DANCING_LINKS("춤추는 링크"),
    KNUTHS_X("크누스 x"),
    SUFFIX_TREE("접미사 트리"),
    GREENS_THEOREM("그린 정리"),
    CHORDAL_GRAPH("현 그래프"),
    DIRECTED_MINIMUM_SPANNING_TREE("유향 최소 신장 트리"),
    PICKS_THEOREM("픽의 정리"),
    CARTESIAN_TREE("데카르트 트리"),
    TOP_TREE("탑 트리"),
    BOOLEAN_OPERATIONS_ON_GEOMETRIC_OBJECTS("보이어–무어 다수결 투표"),
    RED_BLACK_TREE("도형에서의 불 연산"),
    DIFFERENTIAL_CRYPTANALYSIS("레드-블랙 트리"),
    A_STAR("차분 공격"),
    DEGREE_SEQUENCE("a*"),
    HACKENBUSH("차수열");

    override fun toString(): String = value
}