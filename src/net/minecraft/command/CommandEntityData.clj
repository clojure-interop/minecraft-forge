(ns net.minecraft.command.CommandEntityData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandEntityData]))

(defn ->command-entity-data
  "Constructor."
  (^CommandEntityData []
    (new CommandEntityData )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandEntityData this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandEntityData this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandEntityData this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandEntityData this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

(defn username-index?
  "args - `java.lang.String[]`
  index - `int`

  returns: `boolean`"
  (^Boolean [^CommandEntityData this args ^Integer index]
    (-> this (.isUsernameIndex args index))))

