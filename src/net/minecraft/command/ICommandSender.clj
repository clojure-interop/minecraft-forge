(ns net.minecraft.command.ICommandSender
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command ICommandSender]))

(defn get-command-sender-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^ICommandSender this]
    (-> this (.getCommandSenderEntity))))

(defn get-position-vector
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^ICommandSender this]
    (-> this (.getPositionVector))))

(defn get-server
  "returns: `net.minecraft.server.MinecraftServer`"
  (^net.minecraft.server.MinecraftServer [^ICommandSender this]
    (-> this (.getServer))))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^ICommandSender this]
    (-> this (.getPosition))))

(defn set-command-stat
  "type - `net.minecraft.command.CommandResultStats$Type`
  amount - `int`"
  ([^ICommandSender this ^net.minecraft.command.CommandResultStats$Type type ^Integer amount]
    (-> this (.setCommandStat type amount))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^ICommandSender this]
    (-> this (.getDisplayName))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ICommandSender this]
    (-> this (.getName))))

(defn send-message
  "component - `net.minecraft.util.text.ITextComponent`"
  ([^ICommandSender this ^net.minecraft.util.text.ITextComponent component]
    (-> this (.sendMessage component))))

(defn send-command-feedback
  "returns: `boolean`"
  (^Boolean [^ICommandSender this]
    (-> this (.sendCommandFeedback))))

(defn get-entity-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^ICommandSender this]
    (-> this (.getEntityWorld))))

(defn can-use-command?
  "perm-level - `int`
  command-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^ICommandSender this ^Integer perm-level ^java.lang.String command-name]
    (-> this (.canUseCommand perm-level command-name))))

