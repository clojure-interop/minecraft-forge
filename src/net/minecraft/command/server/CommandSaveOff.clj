(ns net.minecraft.command.server.CommandSaveOff
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command.server CommandSaveOff]))

(defn ->command-save-off
  "Constructor."
  (^CommandSaveOff []
    (new CommandSaveOff )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandSaveOff this]
    (-> this (.getName))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandSaveOff this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandSaveOff this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

