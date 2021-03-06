(ns net.minecraft.client.gui.ServerListEntryLanDetected
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui ServerListEntryLanDetected]))

(defn draw-entry
  "slot-index - `int`
  x - `int`
  y - `int`
  list-width - `int`
  slot-height - `int`
  mouse-x - `int`
  mouse-y - `int`
  is-selected - `boolean`"
  ([^ServerListEntryLanDetected this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn mouse-pressed
  "slot-index - `int`
  mouse-x - `int`
  mouse-y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`

  returns: `boolean`"
  (^Boolean [^ServerListEntryLanDetected this ^Integer slot-index ^Integer mouse-x ^Integer mouse-y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mousePressed slot-index mouse-x mouse-y mouse-event relative-x relative-y))))

(defn set-selected
  "p-178011-1 - `int`
  p-178011-2 - `int`
  p-178011-3 - `int`"
  ([^ServerListEntryLanDetected this ^Integer p-178011-1 ^Integer p-178011-2 ^Integer p-178011-3]
    (-> this (.setSelected p-178011-1 p-178011-2 p-178011-3))))

(defn mouse-released
  "slot-index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`"
  ([^ServerListEntryLanDetected this ^Integer slot-index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mouseReleased slot-index x y mouse-event relative-x relative-y))))

(defn get-server-data
  "returns: `net.minecraft.client.network.LanServerInfo`"
  (^net.minecraft.client.network.LanServerInfo [^ServerListEntryLanDetected this]
    (-> this (.getServerData))))

