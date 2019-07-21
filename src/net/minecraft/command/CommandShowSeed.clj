(ns net.minecraft.command.CommandShowSeed
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandShowSeed]))

(defn ->command-show-seed
  "Constructor."
  (^CommandShowSeed []
    (new CommandShowSeed )))

(defn check-permission
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`

  returns: `boolean`"
  (^Boolean [^CommandShowSeed this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender]
    (-> this (.checkPermission server sender))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandShowSeed this]
    (-> this (.getName))))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandShowSeed this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandShowSeed this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandShowSeed this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

