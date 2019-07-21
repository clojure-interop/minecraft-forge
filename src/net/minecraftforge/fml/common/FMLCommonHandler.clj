(ns net.minecraftforge.fml.common.FMLCommonHandler
  "The main class for non-obfuscated hook handling code

  Anything that doesn't require obfuscated or client/server specific code should
  go in this handler

  It also contains a reference to the sided handler instance that is valid
  allowing for common code to access specific properties from the obfuscated world
  without a direct dependency"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common FMLCommonHandler]))

(defn *instance
  "returns: the instance - `net.minecraftforge.fml.common.FMLCommonHandler`"
  (^net.minecraftforge.fml.common.FMLCommonHandler []
    (FMLCommonHandler/instance )))

(defn *call-future
  "task - `java.util.concurrent.FutureTask`"
  ([^java.util.concurrent.FutureTask task]
    (FMLCommonHandler/callFuture task)))

(defn get-side
  "returns: `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^FMLCommonHandler this]
    (-> this (.getSide))))

(defn on-player-post-tick
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^FMLCommonHandler this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.onPlayerPostTick player))))

(defn query-user
  "query - `net.minecraftforge.fml.common.StartupQuery`

  throws: java.lang.InterruptedException"
  ([^FMLCommonHandler this ^net.minecraftforge.fml.common.StartupQuery query]
    (-> this (.queryUser query))))

(defn expect-server-stopped
  "Make handleExit() wait for handleServerStopped().

   For internal use only!"
  ([^FMLCommonHandler this]
    (-> this (.expectServerStopped))))

(defn get-world-thread
  "net - `net.minecraft.network.INetHandler`

  returns: `net.minecraft.util.IThreadListener`"
  (^net.minecraft.util.IThreadListener [^FMLCommonHandler this ^net.minecraft.network.INetHandler net]
    (-> this (.getWorldThread net))))

(defn reload-renderers
  ""
  ([^FMLCommonHandler this]
    (-> this (.reloadRenderers))))

(defn on-render-tick-end
  "timer - `float`"
  ([^FMLCommonHandler this ^Float timer]
    (-> this (.onRenderTickEnd timer))))

(defn process-window-messages
  ""
  ([^FMLCommonHandler this]
    (-> this (.processWindowMessages))))

(defn exit-java
  "Used to exit from java, with system exit preventions in place. Will be tidy about it and just log a message,
   unless debugging is enabled

  exit-code - The exit code - `int`
  hard-exit - Perform a halt instead of an exit (only use when the world is unsavable) - read the warnings at Runtime.halt(int) - `boolean`"
  ([^FMLCommonHandler this ^Integer exit-code ^Boolean hard-exit]
    (-> this (.exitJava exit-code hard-exit))))

(defn bootstrap
  ""
  ([^FMLCommonHandler this]
    (-> this (.bootstrap))))

(defn load-language
  "Loads a lang file, first searching for a marker to enable the 'extended' format {escape characters}
   If the marker is not found it simply returns and let the vanilla code load things.
   The Marker is 'PARSE_ESCAPES' by itself on a line starting with '#' as such:
   #PARSE_ESCAPES

  table - The Map to load each key/value pair into. - `java.util.Map`
  inputstream - Input stream containing the lang file. - `java.io.InputStream`

  returns: A new InputStream that vanilla uses to load normal Lang files, Null if this is a 'enhanced' file and loading is done. - `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^FMLCommonHandler this ^java.util.Map table ^java.io.InputStream inputstream]
    (-> this (.loadLanguage table inputstream))))

(defn get-brandings
  "include-mc - `boolean`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^FMLCommonHandler this ^Boolean include-mc]
    (-> this (.getBrandings include-mc))))

(defn get-client-play-handler
  "returns: `net.minecraft.network.INetHandler`"
  (^net.minecraft.network.INetHandler [^FMLCommonHandler this]
    (-> this (.getClientPlayHandler))))

(defn fire-player-crafting-event
  "player - `net.minecraft.entity.player.EntityPlayer`
  crafted - `net.minecraft.item.ItemStack`
  craft-matrix - `net.minecraft.inventory.IInventory`"
  ([^FMLCommonHandler this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack crafted ^net.minecraft.inventory.IInventory craft-matrix]
    (-> this (.firePlayerCraftingEvent player crafted craft-matrix))))

(defn handle-server-handshake
  "Process initial Handshake packet, kicks players from the server if they are connecting while we are starting up.
   Also verifies the client has the FML marker.

  packet - Handshake Packet - `net.minecraft.network.handshake.client.C00Handshake`
  manager - Network connection - `net.minecraft.network.NetworkManager`

  returns: True to allow connection, otherwise False. - `boolean`"
  (^Boolean [^FMLCommonHandler this ^net.minecraft.network.handshake.client.C00Handshake packet ^net.minecraft.network.NetworkManager manager]
    (-> this (.handleServerHandshake packet manager))))

(defn confirm-backup-level-dat-use
  "handler - `net.minecraft.world.storage.SaveHandler`"
  ([^FMLCommonHandler this ^net.minecraft.world.storage.SaveHandler handler]
    (-> this (.confirmBackupLevelDatUse handler))))

(defn compute-branding
  ""
  ([^FMLCommonHandler this]
    (-> this (.computeBranding))))

(defn on-server-started
  ""
  ([^FMLCommonHandler this]
    (-> this (.onServerStarted))))

(defn get-current-language
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLCommonHandler this]
    (-> this (.getCurrentLanguage))))

(defn fire-player-logged-in
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^FMLCommonHandler this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.firePlayerLoggedIn player))))

(defn handle-world-data-load
  "handler - `net.minecraft.world.storage.SaveHandler`
  world-info - `net.minecraft.world.storage.WorldInfo`
  tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^FMLCommonHandler this ^net.minecraft.world.storage.SaveHandler handler ^net.minecraft.world.storage.WorldInfo world-info ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.handleWorldDataLoad handler world-info tag-compound))))

(defn raise-exception
  "Raise an exception

  exception - `java.lang.Throwable`
  message - `java.lang.String`
  stop-game - `boolean`"
  ([^FMLCommonHandler this ^java.lang.Throwable exception ^java.lang.String message ^Boolean stop-game]
    (-> this (.raiseException exception message stop-game))))

(defn bus
  "Deprecated.

  returns: the event bus - `net.minecraftforge.fml.common.eventhandler.EventBus`"
  (^net.minecraftforge.fml.common.eventhandler.EventBus [^FMLCommonHandler this]
    (-> this (.bus))))

(defn on-post-client-tick
  ""
  ([^FMLCommonHandler this]
    (-> this (.onPostClientTick))))

(defn should-allow-player-logins?
  "returns: `boolean`"
  (^Boolean [^FMLCommonHandler this]
    (-> this (.shouldAllowPlayerLogins))))

(defn handle-world-data-save
  "handler - `net.minecraft.world.storage.SaveHandler`
  world-info - `net.minecraft.world.storage.WorldInfo`
  tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^FMLCommonHandler this ^net.minecraft.world.storage.SaveHandler handler ^net.minecraft.world.storage.WorldInfo world-info ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.handleWorldDataSave handler world-info tag-compound))))

(defn fire-net-registration-event
  "manager - `net.minecraft.network.NetworkManager`
  channel-set - `java.util.Set`
  channel - `java.lang.String`
  side - `net.minecraftforge.fml.relauncher.Side`"
  ([^FMLCommonHandler this ^net.minecraft.network.NetworkManager manager ^java.util.Set channel-set ^java.lang.String channel ^net.minecraftforge.fml.relauncher.Side side]
    (-> this (.fireNetRegistrationEvent manager channel-set channel side))))

(defn on-pre-world-tick
  "Every tick just before world and other ticks occur

  world - `net.minecraft.world.World`"
  ([^FMLCommonHandler this ^net.minecraft.world.World world]
    (-> this (.onPreWorldTick world))))

(defn begin-loading
  "handler - `net.minecraftforge.fml.common.IFMLSidedHandler`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^FMLCommonHandler this ^net.minecraftforge.fml.common.IFMLSidedHandler handler]
    (-> this (.beginLoading handler))))

(defn fire-key-input
  ""
  ([^FMLCommonHandler this]
    (-> this (.fireKeyInput))))

(defn on-render-tick-start
  "timer - `float`"
  ([^FMLCommonHandler this ^Float timer]
    (-> this (.onRenderTickStart timer))))

(defn get-saves-directory
  "returns: `java.io.File`"
  (^java.io.File [^FMLCommonHandler this]
    (-> this (.getSavesDirectory))))

(defn fire-player-item-pickup-event
  "player - `net.minecraft.entity.player.EntityPlayer`
  item - `net.minecraft.entity.item.EntityItem`"
  ([^FMLCommonHandler this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.entity.item.EntityItem item]
    (-> this (.firePlayerItemPickupEvent player item))))

(defn get-fml-logger
  "Get the forge mod loader logging instance (goes to the forgemodloader log file)

  returns: The log instance for the FML log file - `org.apache.logging.log4j.Logger`"
  (^org.apache.logging.log4j.Logger [^FMLCommonHandler this]
    (-> this (.getFMLLogger))))

(defn fire-player-logged-out
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^FMLCommonHandler this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.firePlayerLoggedOut player))))

(defn handle-exit
  "Delayed System.exit() until the server is actually stopped/done saving.

   For internal use only!

  ret-val - Exit code for System.exit() - `int`"
  ([^FMLCommonHandler this ^Integer ret-val]
    (-> this (.handleExit ret-val))))

(defn fire-player-respawn-event
  "player - `net.minecraft.entity.player.EntityPlayer`
  end-conquered - `boolean`"
  ([^FMLCommonHandler this ^net.minecraft.entity.player.EntityPlayer player ^Boolean end-conquered]
    (-> this (.firePlayerRespawnEvent player end-conquered))))

(defn strip-special-chars
  "message - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FMLCommonHandler this ^java.lang.String message]
    (-> this (.stripSpecialChars message))))

(defn get-client-to-server-network-manager
  "returns: `net.minecraft.network.NetworkManager`"
  (^net.minecraft.network.NetworkManager [^FMLCommonHandler this]
    (-> this (.getClientToServerNetworkManager))))

(defn get-effective-side
  "Return the effective side for the context in the game. This is dependent
   on thread analysis to try and determine whether the code is running in the
   server or not. Use at your own risk

  returns: `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side [^FMLCommonHandler this]
    (-> this (.getEffectiveSide))))

(defn find-container-for
  "Find the container that associates with the supplied mod object

  mod - `java.lang.Object`

  returns: `net.minecraftforge.fml.common.ModContainer`"
  (^net.minecraftforge.fml.common.ModContainer [^FMLCommonHandler this ^java.lang.Object mod]
    (-> this (.findContainerFor mod))))

(defn on-player-pre-tick
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^FMLCommonHandler this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.onPlayerPreTick player))))

(defn fire-mouse-input
  ""
  ([^FMLCommonHandler this]
    (-> this (.fireMouseInput))))

(defn get-data-fixer
  "returns: `net.minecraftforge.common.util.CompoundDataFixer`"
  (^net.minecraftforge.common.util.CompoundDataFixer [^FMLCommonHandler this]
    (-> this (.getDataFixer))))

(defn get-minecraft-server-instance
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^FMLCommonHandler this]
    (-> this (.getMinecraftServerInstance))))

(defn on-server-start
  "dedicated-server - `net.minecraft.server.MinecraftServer`"
  ([^FMLCommonHandler this ^net.minecraft.server.MinecraftServer dedicated-server]
    (-> this (.onServerStart dedicated-server))))

(defn add-mod-to-resource-pack
  "container - `net.minecraftforge.fml.common.ModContainer`"
  ([^FMLCommonHandler this ^net.minecraftforge.fml.common.ModContainer container]
    (-> this (.addModToResourcePack container))))

(defn handle-server-stopping
  ""
  ([^FMLCommonHandler this]
    (-> this (.handleServerStopping))))

(defn handle-server-starting
  "server - `net.minecraft.server.MinecraftServer`

  returns: `boolean`"
  (^Boolean [^FMLCommonHandler this ^net.minecraft.server.MinecraftServer server]
    (-> this (.handleServerStarting server))))

(defn handle-server-about-to-start
  "server - `net.minecraft.server.MinecraftServer`

  returns: `boolean`"
  (^Boolean [^FMLCommonHandler this ^net.minecraft.server.MinecraftServer server]
    (-> this (.handleServerAboutToStart server))))

(defn enhance-crash-report
  "crash-report - `net.minecraft.crash.CrashReport`
  category - `net.minecraft.crash.CrashReportCategory`"
  ([^FMLCommonHandler this ^net.minecraft.crash.CrashReport crash-report ^net.minecraft.crash.CrashReportCategory category]
    (-> this (.enhanceCrashReport crash-report category))))

(defn handle-server-started
  ""
  ([^FMLCommonHandler this]
    (-> this (.handleServerStarted))))

(defn on-pre-client-tick
  ""
  ([^FMLCommonHandler this]
    (-> this (.onPreClientTick))))

(defn show-gui-screen
  "client-gui-element - `java.lang.Object`"
  ([^FMLCommonHandler this ^java.lang.Object client-gui-element]
    (-> this (.showGuiScreen client-gui-element))))

(defn on-pre-server-tick
  ""
  ([^FMLCommonHandler this]
    (-> this (.onPreServerTick))))

(defn get-sided-delegate
  "returns: `net.minecraftforge.fml.common.IFMLSidedHandler`"
  (^net.minecraftforge.fml.common.IFMLSidedHandler [^FMLCommonHandler this]
    (-> this (.getSidedDelegate))))

(defn get-mod-name
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLCommonHandler this]
    (-> this (.getModName))))

(defn register-crash-callable
  "callable - `net.minecraftforge.fml.common.ICrashCallable`"
  ([^FMLCommonHandler this ^net.minecraftforge.fml.common.ICrashCallable callable]
    (-> this (.registerCrashCallable callable))))

(defn fire-player-smelted-event
  "player - `net.minecraft.entity.player.EntityPlayer`
  smelted - `net.minecraft.item.ItemStack`"
  ([^FMLCommonHandler this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack smelted]
    (-> this (.firePlayerSmeltedEvent player smelted))))

(defn fire-sided-registry-events
  ""
  ([^FMLCommonHandler this]
    (-> this (.fireSidedRegistryEvents))))

(defn on-post-server-tick
  ""
  ([^FMLCommonHandler this]
    (-> this (.onPostServerTick))))

(defn on-post-world-tick
  "Every tick just after world and other ticks occur

  world - `net.minecraft.world.World`"
  ([^FMLCommonHandler this ^net.minecraft.world.World world]
    (-> this (.onPostWorldTick world))))

(defn handle-server-stopped
  ""
  ([^FMLCommonHandler this]
    (-> this (.handleServerStopped))))

(defn should-server-be-killed-quietly?
  "returns: `boolean`"
  (^Boolean [^FMLCommonHandler this]
    (-> this (.shouldServerBeKilledQuietly))))

(defn fire-player-changed-dimension-event
  "player - `net.minecraft.entity.player.EntityPlayer`
  from-dim - `int`
  to-dim - `int`"
  ([^FMLCommonHandler this ^net.minecraft.entity.player.EntityPlayer player ^Integer from-dim ^Integer to-dim]
    (-> this (.firePlayerChangedDimensionEvent player from-dim to-dim))))

