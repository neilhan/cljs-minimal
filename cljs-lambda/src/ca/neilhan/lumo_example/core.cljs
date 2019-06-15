(ns ca.neilhan.lumo-example.core)

(defn ^:export example [event ctx cb]
  (js/console.log "called with v0.2:" event ctx cb)
  (cb nil event))
