(set-env!
 :source-paths    #{"src/cljs"}
 :resource-paths  #{"resources"}
 :dependencies '[[adzerk/boot-cljs   "1.7.228-2"    :scope "test"]
                 	    [adzerk/boot-reload "0.5.2"        :scope "test"]
                      [pandeiro/boot-http "0.8.3"        :scope "test"]
                      [org.clojure/clojurescript "1.9.946"]
                      [org.clojure/clojure "1.9.0"]])

(require
 '[adzerk.boot-cljs      :refer [cljs]]
 '[adzerk.boot-reload    :refer [reload]]
 '[pandeiro.boot-http    :refer [serve]])

(task-options!
    reload {:on-jsload 'starter.app/main})

(deftask start []
  (comp (serve) (watch) (reload) (cljs) ))
