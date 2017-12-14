(ns starter.app
  (:require [starter.what :as w]))

(defn main []
  (js/alert (str "Let's build a " (w/what-type))))

; (defn main []
;   (js/alert "But first .. a small break!"))