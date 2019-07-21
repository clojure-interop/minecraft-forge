(ns net.minecraft.network.ServerStatusResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network ServerStatusResponse]))

(defn ->server-status-response
  "Constructor."
  (^ServerStatusResponse []
    (new ServerStatusResponse )))

(defn set-version
  "version-in - `net.minecraft.network.ServerStatusResponse$Version`"
  ([^ServerStatusResponse this ^net.minecraft.network.ServerStatusResponse$Version version-in]
    (-> this (.setVersion version-in))))

(defn get-players
  "returns: `net.minecraft.network.ServerStatusResponse$Players`"
  (^net.minecraft.network.ServerStatusResponse$Players [^ServerStatusResponse this]
    (-> this (.getPlayers))))

(defn get-server-description
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ServerStatusResponse this]
    (-> this (.getServerDescription))))

(defn get-json
  "Returns this object as a Json string.
   Converting to JSON if a cached version is not available.

   Also to prevent potentially large memory allocations on the server
   this is moved from the S00PacketServerInfo writePacket function

   As this method is called from the network threads thread safety is important!

  returns: `java.lang.String`"
  (^java.lang.String [^ServerStatusResponse this]
    (-> this (.getJson))))

(defn invalidate-json
  "Invalidates the cached json, causing the next call to getJson to rebuild it.
   This is needed externally because PlayerCountData.setPlayer's is public."
  ([^ServerStatusResponse this]
    (-> this (.invalidateJson))))

(defn set-players
  "players-in - `net.minecraft.network.ServerStatusResponse$Players`"
  ([^ServerStatusResponse this ^net.minecraft.network.ServerStatusResponse$Players players-in]
    (-> this (.setPlayers players-in))))

(defn get-version
  "returns: `net.minecraft.network.ServerStatusResponse$Version`"
  (^net.minecraft.network.ServerStatusResponse$Version [^ServerStatusResponse this]
    (-> this (.getVersion))))

(defn set-favicon
  "favicon-blob - `java.lang.String`"
  ([^ServerStatusResponse this ^java.lang.String favicon-blob]
    (-> this (.setFavicon favicon-blob))))

(defn set-server-description
  "description-in - `net.minecraft.util.text.ITextComponent`"
  ([^ServerStatusResponse this ^net.minecraft.util.text.ITextComponent description-in]
    (-> this (.setServerDescription description-in))))

(defn get-favicon
  "returns: `java.lang.String`"
  (^java.lang.String [^ServerStatusResponse this]
    (-> this (.getFavicon))))

