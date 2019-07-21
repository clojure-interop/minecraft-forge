(ns net.minecraftforge.fml.server.FMLServerHandler
  "Handles primary communication from hooked code into the system

  The FML entry point is beginServerLoading(MinecraftServer) called from
  DedicatedServer

  Obfuscated code should focus on this class and other members of the \"server\"
  (or \"client\") code

  The actual mod loading is handled at arms length by Loader

  It is expected that a similar class will exist for each target environment:
  Bukkit and Client side.

  It should not be directly modified."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.server FMLServerHandler]))

(defn *instance
  "returns: the instance - `net.minecraftforge.fml.server.FMLServerHandler`"
  (^net.minecraftforge.fml.server.FMLServerHandler []
    (FMLServerHandler/instance )))

(defn get-side
  "returns: `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^FMLServerHandler this]
    (-> this (.getSide))))

(defn query-user
  "query - `net.minecraftforge.fml.common.StartupQuery`

  throws: java.lang.InterruptedException"
  ([^FMLServerHandler this ^net.minecraftforge.fml.common.StartupQuery query]
    (-> this (.queryUser query))))

(defn get-world-thread
  "net - `net.minecraft.network.INetHandler`

  returns: `net.minecraft.util.IThreadListener`"
  (^net.minecraft.util.IThreadListener [^FMLServerHandler this ^net.minecraft.network.INetHandler net]
    (-> this (.getWorldThread net))))

(defn reload-renderers
  ""
  ([^FMLServerHandler this]
    (-> this (.reloadRenderers))))

(defn get-additional-branding-information
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^FMLServerHandler this]
    (-> this (.getAdditionalBrandingInformation))))

(defn process-window-messages
  ""
  ([^FMLServerHandler this]
    (-> this (.processWindowMessages))))

(defn get-server
  "Get the server instance

  returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^FMLServerHandler this]
    (-> this (.getServer))))

(defn get-client-play-handler
  "returns: `net.minecraft.network.INetHandler`"
  (^net.minecraft.network.INetHandler [^FMLServerHandler this]
    (-> this (.getClientPlayHandler))))

(defn halt-game
  "message - `java.lang.String`
  exception - `java.lang.Throwable`"
  ([^FMLServerHandler this ^java.lang.String message ^java.lang.Throwable exception]
    (-> this (.haltGame message exception))))

(defn add-mod-as-resource
  "container - `net.minecraftforge.fml.common.ModContainer`"
  ([^FMLServerHandler this ^net.minecraftforge.fml.common.ModContainer container]
    (-> this (.addModAsResource container))))

(defn finish-server-loading
  "Called a bit later on during server initialization to finish loading mods"
  ([^FMLServerHandler this]
    (-> this (.finishServerLoading))))

(defn get-current-language
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLServerHandler this]
    (-> this (.getCurrentLanguage))))

(defn should-allow-player-logins?
  "returns: `boolean`"
  (^Boolean [^FMLServerHandler this]
    (-> this (.shouldAllowPlayerLogins))))

(defn fire-net-registration-event
  "bus - `net.minecraftforge.fml.common.eventhandler.EventBus`
  manager - `net.minecraft.network.NetworkManager`
  channel-set - `java.util.Set`
  channel - `java.lang.String`
  side - `net.minecraftforge.fml.relauncher.Side`"
  ([^FMLServerHandler this ^net.minecraftforge.fml.common.eventhandler.EventBus bus ^net.minecraft.network.NetworkManager manager ^java.util.Set channel-set ^java.lang.String channel ^net.minecraftforge.fml.relauncher.Side side]
    (-> this (.fireNetRegistrationEvent bus manager channel-set channel side))))

(defn begin-server-loading
  "Called to start the whole game off from
   MinecraftServer#startServer

  minecraft-server - server - `net.minecraft.server.MinecraftServer`"
  ([^FMLServerHandler this ^net.minecraft.server.MinecraftServer minecraft-server]
    (-> this (.beginServerLoading minecraft-server))))

(defn get-saves-directory
  "returns: `java.io.File`"
  (^java.io.File [^FMLServerHandler this]
    (-> this (.getSavesDirectory))))

(defn allow-logins
  ""
  ([^FMLServerHandler this]
    (-> this (.allowLogins))))

(defn server-stopped
  ""
  ([^FMLServerHandler this]
    (-> this (.serverStopped))))

(defn strip-special-chars
  "message - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLServerHandler this ^java.lang.String message]
    (-> this (.stripSpecialChars message))))

(defn get-client-to-server-network-manager
  "returns: `net.minecraft.network.NetworkManager`"
  (^net.minecraft.network.NetworkManager [^FMLServerHandler this]
    (-> this (.getClientToServerNetworkManager))))

(defn get-data-fixer
  "returns: `net.minecraftforge.common.util.CompoundDataFixer`"
  (^net.minecraftforge.common.util.CompoundDataFixer [^FMLServerHandler this]
    (-> this (.getDataFixer))))

(defn should-server-should-be-killed-quietly?
  "returns: `boolean`"
  (^Boolean [^FMLServerHandler this]
    (-> this (.shouldServerShouldBeKilledQuietly))))

(defn show-gui-screen
  "client-gui-element - `java.lang.Object`"
  ([^FMLServerHandler this ^java.lang.Object client-gui-element]
    (-> this (.showGuiScreen client-gui-element))))

(defn fire-sided-registry-events
  ""
  ([^FMLServerHandler this]
    (-> this (.fireSidedRegistryEvents))))

