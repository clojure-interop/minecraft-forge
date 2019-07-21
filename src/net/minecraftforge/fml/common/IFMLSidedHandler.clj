(ns net.minecraftforge.fml.common.IFMLSidedHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common IFMLSidedHandler]))

(defn get-side
  "returns: `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^IFMLSidedHandler this]
    (-> this (.getSide))))

(defn query-user
  "query - `net.minecraftforge.fml.common.StartupQuery`

  throws: java.lang.InterruptedException"
  ([^IFMLSidedHandler this ^net.minecraftforge.fml.common.StartupQuery query]
    (-> this (.queryUser query))))

(defn get-world-thread
  "net - `net.minecraft.network.INetHandler`

  returns: `net.minecraft.util.IThreadListener`"
  (^net.minecraft.util.IThreadListener [^IFMLSidedHandler this ^net.minecraft.network.INetHandler net]
    (-> this (.getWorldThread net))))

(defn reload-renderers
  ""
  ([^IFMLSidedHandler this]
    (-> this (.reloadRenderers))))

(defn get-additional-branding-information
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^IFMLSidedHandler this]
    (-> this (.getAdditionalBrandingInformation))))

(defn process-window-messages
  ""
  ([^IFMLSidedHandler this]
    (-> this (.processWindowMessages))))

(defn get-server
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^IFMLSidedHandler this]
    (-> this (.getServer))))

(defn get-client-play-handler
  "returns: `net.minecraft.network.INetHandler`"
  (^net.minecraft.network.INetHandler [^IFMLSidedHandler this]
    (-> this (.getClientPlayHandler))))

(defn halt-game
  "message - `java.lang.String`
  exception - `java.lang.Throwable`"
  ([^IFMLSidedHandler this ^java.lang.String message ^java.lang.Throwable exception]
    (-> this (.haltGame message exception))))

(defn add-mod-as-resource
  "container - `net.minecraftforge.fml.common.ModContainer`"
  ([^IFMLSidedHandler this ^net.minecraftforge.fml.common.ModContainer container]
    (-> this (.addModAsResource container))))

(defn finish-server-loading
  ""
  ([^IFMLSidedHandler this]
    (-> this (.finishServerLoading))))

(defn get-current-language
  "returns: `java.lang.String`"
  (^java.lang.String [^IFMLSidedHandler this]
    (-> this (.getCurrentLanguage))))

(defn should-allow-player-logins?
  "returns: `boolean`"
  (^Boolean [^IFMLSidedHandler this]
    (-> this (.shouldAllowPlayerLogins))))

(defn fire-net-registration-event
  "bus - `net.minecraftforge.fml.common.eventhandler.EventBus`
  manager - `net.minecraft.network.NetworkManager`
  channel-set - `java.util.Set`
  channel - `java.lang.String`
  side - `net.minecraftforge.fml.relauncher.Side`"
  ([^IFMLSidedHandler this ^net.minecraftforge.fml.common.eventhandler.EventBus bus ^net.minecraft.network.NetworkManager manager ^java.util.Set channel-set ^java.lang.String channel ^net.minecraftforge.fml.relauncher.Side side]
    (-> this (.fireNetRegistrationEvent bus manager channel-set channel side))))

(defn begin-server-loading
  "server - `net.minecraft.server.MinecraftServer`"
  ([^IFMLSidedHandler this ^net.minecraft.server.MinecraftServer server]
    (-> this (.beginServerLoading server))))

(defn get-saves-directory
  "returns: `java.io.File`"
  (^java.io.File [^IFMLSidedHandler this]
    (-> this (.getSavesDirectory))))

(defn allow-logins
  ""
  ([^IFMLSidedHandler this]
    (-> this (.allowLogins))))

(defn server-stopped
  ""
  ([^IFMLSidedHandler this]
    (-> this (.serverStopped))))

(defn strip-special-chars
  "message - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^IFMLSidedHandler this ^java.lang.String message]
    (-> this (.stripSpecialChars message))))

(defn get-client-to-server-network-manager
  "returns: `net.minecraft.network.NetworkManager`"
  (^net.minecraft.network.NetworkManager [^IFMLSidedHandler this]
    (-> this (.getClientToServerNetworkManager))))

(defn get-data-fixer
  "returns: `net.minecraftforge.common.util.CompoundDataFixer`"
  (^net.minecraftforge.common.util.CompoundDataFixer [^IFMLSidedHandler this]
    (-> this (.getDataFixer))))

(defn should-server-should-be-killed-quietly?
  "returns: `boolean`"
  (^Boolean [^IFMLSidedHandler this]
    (-> this (.shouldServerShouldBeKilledQuietly))))

(defn show-gui-screen
  "client-gui-element - `java.lang.Object`"
  ([^IFMLSidedHandler this ^java.lang.Object client-gui-element]
    (-> this (.showGuiScreen client-gui-element))))

(defn fire-sided-registry-events
  ""
  ([^IFMLSidedHandler this]
    (-> this (.fireSidedRegistryEvents))))

