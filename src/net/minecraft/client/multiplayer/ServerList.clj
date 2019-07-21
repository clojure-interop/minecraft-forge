(ns net.minecraft.client.multiplayer.ServerList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.multiplayer ServerList]))

(defn ->server-list
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`"
  (^ServerList [^net.minecraft.client.Minecraft mc-in]
    (new ServerList mc-in)))

(defn *save-single-server
  "server - `net.minecraft.client.multiplayer.ServerData`"
  ([^net.minecraft.client.multiplayer.ServerData server]
    (ServerList/saveSingleServer server)))

(defn load-server-list
  ""
  ([^ServerList this]
    (-> this (.loadServerList))))

(defn save-server-list
  ""
  ([^ServerList this]
    (-> this (.saveServerList))))

(defn get-server-data
  "index - `int`

  returns: `net.minecraft.client.multiplayer.ServerData`"
  (^net.minecraft.client.multiplayer.ServerData [^ServerList this ^Integer index]
    (-> this (.getServerData index))))

(defn remove-server-data
  "index - `int`"
  ([^ServerList this ^Integer index]
    (-> this (.removeServerData index))))

(defn add-server-data
  "server - `net.minecraft.client.multiplayer.ServerData`"
  ([^ServerList this ^net.minecraft.client.multiplayer.ServerData server]
    (-> this (.addServerData server))))

(defn count-servers
  "returns: `int`"
  (^Integer [^ServerList this]
    (-> this (.countServers))))

(defn swap-servers
  "pos-1 - `int`
  pos-2 - `int`"
  ([^ServerList this ^Integer pos-1 ^Integer pos-2]
    (-> this (.swapServers pos-1 pos-2))))

(defn set
  "index - `int`
  server - `net.minecraft.client.multiplayer.ServerData`"
  ([^ServerList this ^Integer index ^net.minecraft.client.multiplayer.ServerData server]
    (-> this (.set index server))))

