(ns net.minecraftforge.fml.client.FMLClientHandler
  "Handles primary communication from hooked code into the system

  The FML entry point is beginMinecraftLoading(Minecraft, List, IReloadableResourceManager, MetadataSerializer) called from
  Minecraft

  Obfuscated code should focus on this class and other members of the \"server\"
  (or \"client\") code

  The actual mod loading is handled at arms length by Loader

  It is expected that a similar class will exist for each target environment:
  Bukkit and Client side.

  It should not be directly modified."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client FMLClientHandler]))

(defn ->fml-client-handler
  "Constructor."
  (^FMLClientHandler []
    (new FMLClientHandler )))

(defn *instance
  "returns: the instance - `net.minecraftforge.fml.client.FMLClientHandler`"
  (^net.minecraftforge.fml.client.FMLClientHandler []
    (FMLClientHandler/instance )))

(defn get-side
  "returns: `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^FMLClientHandler this]
    (-> this (.getSide))))

(defn fix-description
  "description - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLClientHandler this ^java.lang.String description]
    (-> this (.fixDescription description))))

(defn query-user
  "query - `net.minecraftforge.fml.common.StartupQuery`

  throws: java.lang.InterruptedException"
  ([^FMLClientHandler this ^net.minecraftforge.fml.common.StartupQuery query]
    (-> this (.queryUser query))))

(defn set-play-client
  "net-handler-play-client - `net.minecraft.client.network.NetHandlerPlayClient`"
  ([^FMLClientHandler this ^net.minecraft.client.network.NetHandlerPlayClient net-handler-play-client]
    (-> this (.setPlayClient net-handler-play-client))))

(defn handle-loading-screen
  "scaled-resolution - `net.minecraft.client.gui.ScaledResolution`

  returns: `boolean`

  throws: java.io.IOException"
  (^Boolean [^FMLClientHandler this ^net.minecraft.client.gui.ScaledResolution scaled-resolution]
    (-> this (.handleLoadingScreen scaled-resolution))))

(defn get-world-thread
  "net - `net.minecraft.network.INetHandler`

  returns: `net.minecraft.util.IThreadListener`"
  (^net.minecraft.util.IThreadListener [^FMLClientHandler this ^net.minecraft.network.INetHandler net]
    (-> this (.getWorldThread net))))

(defn reload-renderers
  ""
  ([^FMLClientHandler this]
    (-> this (.reloadRenderers))))

(defn get-client
  "Get the server instance

  returns: `net.minecraft.client.Minecraft`"
  (^net.minecraft.client.Minecraft [^FMLClientHandler this]
    (-> this (.getClient))))

(defn connect-to-server
  "gui-multiplayer - `net.minecraft.client.gui.GuiScreen`
  server-entry - `net.minecraft.client.multiplayer.ServerData`"
  ([^FMLClientHandler this ^net.minecraft.client.gui.GuiScreen gui-multiplayer ^net.minecraft.client.multiplayer.ServerData server-entry]
    (-> this (.connectToServer gui-multiplayer server-entry))))

(defn get-additional-branding-information
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^FMLClientHandler this]
    (-> this (.getAdditionalBrandingInformation))))

(defn process-window-messages
  ""
  ([^FMLClientHandler this]
    (-> this (.processWindowMessages))))

(defn display-missing-mods
  "mod-missing-packet - `java.lang.Object`"
  ([^FMLClientHandler this ^java.lang.Object mod-missing-packet]
    (-> this (.displayMissingMods mod-missing-packet))))

(defn capture-additional-data
  "serverstatusresponse - `net.minecraft.network.ServerStatusResponse`
  jsonobject - `com.google.gson.JsonObject`"
  ([^FMLClientHandler this ^net.minecraft.network.ServerStatusResponse serverstatusresponse ^com.google.gson.JsonObject jsonobject]
    (-> this (.captureAdditionalData serverstatusresponse jsonobject))))

(defn get-server
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^FMLClientHandler this]
    (-> this (.getServer))))

(defn get-client-play-handler
  "returns: `net.minecraft.network.INetHandler`"
  (^net.minecraft.network.INetHandler [^FMLClientHandler this]
    (-> this (.getClientPlayHandler))))

(defn halt-game
  "message - `java.lang.String`
  t - `java.lang.Throwable`"
  ([^FMLClientHandler this ^java.lang.String message ^java.lang.Throwable t]
    (-> this (.haltGame message t))))

(defn on-initialization-complete
  ""
  ([^FMLClientHandler this]
    (-> this (.onInitializationComplete))))

(defn log-missing-texture-errors
  ""
  ([^FMLClientHandler this]
    (-> this (.logMissingTextureErrors))))

(defn add-mod-as-resource
  "container - `net.minecraftforge.fml.common.ModContainer`"
  ([^FMLClientHandler this ^net.minecraftforge.fml.common.ModContainer container]
    (-> this (.addModAsResource container))))

(defn finish-server-loading
  ""
  ([^FMLClientHandler this]
    (-> this (.finishServerLoading))))

(defn get-current-language
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLClientHandler this]
    (-> this (.getCurrentLanguage))))

(defn bind-server-list-data
  "data - `net.minecraft.client.multiplayer.ServerData`
  original-response - `net.minecraft.network.ServerStatusResponse`"
  ([^FMLClientHandler this ^net.minecraft.client.multiplayer.ServerData data ^net.minecraft.network.ServerStatusResponse original-response]
    (-> this (.bindServerListData data original-response))))

(defn should-allow-player-logins?
  "returns: `boolean`"
  (^Boolean [^FMLClientHandler this]
    (-> this (.shouldAllowPlayerLogins))))

(defn fire-net-registration-event
  "bus - `net.minecraftforge.fml.common.eventhandler.EventBus`
  manager - `net.minecraft.network.NetworkManager`
  channel-set - `java.util.Set`
  channel - `java.lang.String`
  side - `net.minecraftforge.fml.relauncher.Side`"
  ([^FMLClientHandler this ^net.minecraftforge.fml.common.eventhandler.EventBus bus ^net.minecraft.network.NetworkManager manager ^java.util.Set channel-set ^java.lang.String channel ^net.minecraftforge.fml.relauncher.Side side]
    (-> this (.fireNetRegistrationEvent bus manager channel-set channel side))))

(defn display-gui-screen
  "player - `net.minecraft.entity.player.EntityPlayer`
  gui - `net.minecraft.client.gui.GuiScreen`"
  ([^FMLClientHandler this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.client.gui.GuiScreen gui]
    (-> this (.displayGuiScreen player gui))))

(defn enhance-server-list-entry
  "server-list-entry - `net.minecraft.client.gui.ServerListEntryNormal`
  server-entry - `net.minecraft.client.multiplayer.ServerData`
  x - `int`
  width - `int`
  y - `int`
  relative-mouse-x - `int`
  relative-mouse-y - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLClientHandler this ^net.minecraft.client.gui.ServerListEntryNormal server-list-entry ^net.minecraft.client.multiplayer.ServerData server-entry ^Integer x ^Integer width ^Integer y ^Integer relative-mouse-x ^Integer relative-mouse-y]
    (-> this (.enhanceServerListEntry server-list-entry server-entry x width y relative-mouse-x relative-mouse-y))))

(defn begin-server-loading
  "server - `net.minecraft.server.MinecraftServer`"
  ([^FMLClientHandler this ^net.minecraft.server.MinecraftServer server]
    (-> this (.beginServerLoading server))))

(defn get-world-client
  "returns: `net.minecraft.client.multiplayer.WorldClient`"
  (^net.minecraft.client.multiplayer.WorldClient [^FMLClientHandler this]
    (-> this (.getWorldClient))))

(defn try-load-existing-world
  "select-world-gui - `net.minecraft.client.gui.GuiWorldSelection`
  comparator - `net.minecraft.world.storage.WorldSummary`"
  ([^FMLClientHandler this ^net.minecraft.client.gui.GuiWorldSelection select-world-gui ^net.minecraft.world.storage.WorldSummary comparator]
    (-> this (.tryLoadExistingWorld select-world-gui comparator))))

(defn begin-minecraft-loading
  "Called to start the whole game off

  minecraft - The minecraft instance being launched - `net.minecraft.client.Minecraft`
  resource-pack-list - The resource pack list we will populate with mods - `java.util.List`
  resource-manager - The resource manager - `net.minecraft.client.resources.IReloadableResourceManager`
  meta-serializer - `net.minecraft.client.resources.data.MetadataSerializer`"
  ([^FMLClientHandler this ^net.minecraft.client.Minecraft minecraft ^java.util.List resource-pack-list ^net.minecraft.client.resources.IReloadableResourceManager resource-manager ^net.minecraft.client.resources.data.MetadataSerializer meta-serializer]
    (-> this (.beginMinecraftLoading minecraft resource-pack-list resource-manager meta-serializer))))

(defn get-saves-directory
  "returns: `java.io.File`"
  (^java.io.File [^FMLClientHandler this]
    (-> this (.getSavesDirectory))))

(defn loading?
  "If the client is in the midst of loading, we disable saving so that custom settings aren't wiped out

  returns: `boolean`"
  (^Boolean [^FMLClientHandler this]
    (-> this (.isLoading))))

(defn handle-client-world-closing
  "world - `net.minecraft.client.multiplayer.WorldClient`"
  ([^FMLClientHandler this ^net.minecraft.client.multiplayer.WorldClient world]
    (-> this (.handleClientWorldClosing world))))

(defn allow-logins
  ""
  ([^FMLClientHandler this]
    (-> this (.allowLogins))))

(defn server-stopped
  ""
  ([^FMLClientHandler this]
    (-> this (.serverStopped))))

(defn strip-special-chars
  "message - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLClientHandler this ^java.lang.String message]
    (-> this (.stripSpecialChars message))))

(defn get-client-to-server-network-manager
  "returns: `net.minecraft.network.NetworkManager`"
  (^net.minecraft.network.NetworkManager [^FMLClientHandler this]
    (-> this (.getClientToServerNetworkManager))))

(defn add-special-mod-entries
  "mods - `java.util.ArrayList`"
  ([^FMLClientHandler this ^java.util.ArrayList mods]
    (-> this (.addSpecialModEntries mods))))

(defn has-optifine?
  "returns: `boolean`"
  (^Boolean [^FMLClientHandler this]
    (-> this (.hasOptifine))))

(defn extend-mod-list
  ""
  ([^FMLClientHandler this]
    (-> this (.extendModList))))

(defn get-saves-dir
  "returns: `java.io.File`"
  (^java.io.File [^FMLClientHandler this]
    (-> this (.getSavesDir))))

(defn get-resource-pack-for
  "mod-id - `java.lang.String`

  returns: `net.minecraft.client.resources.IResourcePack`"
  (^net.minecraft.client.resources.IResourcePack [^FMLClientHandler this ^java.lang.String mod-id]
    (-> this (.getResourcePackFor mod-id))))

(defn get-data-fixer
  "returns: `net.minecraftforge.common.util.CompoundDataFixer`"
  (^net.minecraftforge.common.util.CompoundDataFixer [^FMLClientHandler this]
    (-> this (.getDataFixer))))

(defn should-server-should-be-killed-quietly?
  "returns: `boolean`"
  (^Boolean [^FMLClientHandler this]
    (-> this (.shouldServerShouldBeKilledQuietly))))

(defn track-broken-texture
  "resource-location - `net.minecraft.util.ResourceLocation`
  error - `java.lang.String`"
  ([^FMLClientHandler this ^net.minecraft.util.ResourceLocation resource-location ^java.lang.String error]
    (-> this (.trackBrokenTexture resource-location error))))

(defn connect-to-server-at-startup
  "host - `java.lang.String`
  port - `int`"
  ([^FMLClientHandler this ^java.lang.String host ^Integer port]
    (-> this (.connectToServerAtStartup host port))))

(defn setup-server-list
  ""
  ([^FMLClientHandler this]
    (-> this (.setupServerList))))

(defn show-in-game-mod-options
  "gui-ingame-menu - `net.minecraft.client.gui.GuiIngameMenu`"
  ([^FMLClientHandler this ^net.minecraft.client.gui.GuiIngameMenu gui-ingame-menu]
    (-> this (.showInGameModOptions gui-ingame-menu))))

(defn start-integrated-server
  "id - `java.lang.String`
  name - `java.lang.String`
  settings - `net.minecraft.world.WorldSettings`"
  ([^FMLClientHandler this ^java.lang.String id ^java.lang.String name ^net.minecraft.world.WorldSettings settings]
    (-> this (.startIntegratedServer id name settings))))

(defn show-gui-screen
  "client-gui-element - `java.lang.Object`"
  ([^FMLClientHandler this ^java.lang.Object client-gui-element]
    (-> this (.showGuiScreen client-gui-element))))

(defn get-client-player-entity
  "returns: `net.minecraft.client.entity.EntityPlayerSP`"
  (^net.minecraft.client.entity.EntityPlayerSP [^FMLClientHandler this]
    (-> this (.getClientPlayerEntity))))

(defn gui-open?
  "Is this GUI type open?

  gui - The type of GUI to test for - `java.lang.Class`

  returns: if a GUI of this type is open - `boolean`"
  (^Boolean [^FMLClientHandler this ^java.lang.Class gui]
    (-> this (.isGUIOpen gui))))

(defn get-gui-factory-for
  "selected-mod - `net.minecraftforge.fml.common.ModContainer`

  returns: `net.minecraftforge.fml.client.IModGuiFactory`"
  (^net.minecraftforge.fml.client.IModGuiFactory [^FMLClientHandler this ^net.minecraftforge.fml.common.ModContainer selected-mod]
    (-> this (.getGuiFactoryFor selected-mod))))

(defn fire-sided-registry-events
  ""
  ([^FMLClientHandler this]
    (-> this (.fireSidedRegistryEvents))))

(defn finish-minecraft-loading
  "Called a bit later on during initialization to finish loading mods
   Also initializes key bindings"
  ([^FMLClientHandler this]
    (-> this (.finishMinecraftLoading))))

(defn track-missing-texture
  "resource-location - `net.minecraft.util.ResourceLocation`"
  ([^FMLClientHandler this ^net.minecraft.util.ResourceLocation resource-location]
    (-> this (.trackMissingTexture resource-location))))

(defn connect-to-realms-server
  "host - `java.lang.String`
  port - `int`"
  ([^FMLClientHandler this ^java.lang.String host ^Integer port]
    (-> this (.connectToRealmsServer host port))))

