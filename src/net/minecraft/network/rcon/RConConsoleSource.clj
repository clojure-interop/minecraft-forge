(ns net.minecraft.network.rcon.RConConsoleSource
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.rcon RConConsoleSource]))

(defn ->r-con-console-source
  "Constructor.

  server-in - `net.minecraft.server.MinecraftServer`"
  (^RConConsoleSource [^net.minecraft.server.MinecraftServer server-in]
    (new RConConsoleSource server-in)))

(defn get-command-sender-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^RConConsoleSource this]
    (-> this (.getCommandSenderEntity))))

(defn get-position-vector
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^RConConsoleSource this]
    (-> this (.getPositionVector))))

(defn reset-log
  ""
  ([^RConConsoleSource this]
    (-> this (.resetLog))))

(defn get-server
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^RConConsoleSource this]
    (-> this (.getServer))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^RConConsoleSource this]
    (-> this (.getPosition))))

(defn set-command-stat
  "type - `net.minecraft.command.CommandResultStats$Type`
  amount - `int`"
  ([^RConConsoleSource this ^net.minecraft.command.CommandResultStats$Type type ^Integer amount]
    (-> this (.setCommandStat type amount))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^RConConsoleSource this]
    (-> this (.getDisplayName))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^RConConsoleSource this]
    (-> this (.getName))))

(defn send-message
  "component - `net.minecraft.util.text.ITextComponent`"
  ([^RConConsoleSource this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.sendMessage component))))

(defn send-command-feedback
  "returns: `boolean`"
  (^Boolean [^RConConsoleSource this]
    (-> this (.sendCommandFeedback))))

(defn get-entity-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^RConConsoleSource this]
    (-> this (.getEntityWorld))))

(defn can-use-command?
  "perm-level - `int`
  command-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^RConConsoleSource this ^Integer perm-level ^java.lang.String command-name]
    (-> this (.canUseCommand perm-level command-name))))

(defn get-log-contents
  "returns: `java.lang.String`"
  (^java.lang.String [^RConConsoleSource this]
    (-> this (.getLogContents))))

