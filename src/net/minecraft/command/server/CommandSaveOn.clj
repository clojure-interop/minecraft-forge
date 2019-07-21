(ns net.minecraft.command.server.CommandSaveOn
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command.server CommandSaveOn]))

(defn ->command-save-on
  "Constructor."
  (^CommandSaveOn []
    (new CommandSaveOn )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^CommandSaveOn this]
    (-> this (.getName))))

(defn get-usage
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.lang.String`"
  (^java.lang.String [^CommandSaveOn this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getUsage sender))))

(defn execute
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`

  throws: net.minecraft.command.CommandException"
  ([^CommandSaveOn this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args]
    (-> this (.execute server sender args))))

