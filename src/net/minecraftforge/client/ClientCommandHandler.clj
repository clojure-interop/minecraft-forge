(ns net.minecraftforge.client.ClientCommandHandler
  "The class that handles client-side chat commands. You should register any
  commands that you want handled on the client with this command handler.

  If there is a command with the same name registered both on the server and
  client, the client takes precedence!"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client ClientCommandHandler]))

(defn ->client-command-handler
  "Constructor."
  (^ClientCommandHandler []
    (new ClientCommandHandler )))

(def *-instance
  "Static Constant.

  type: net.minecraftforge.client.ClientCommandHandler"
  ClientCommandHandler/instance)

(defn latest-auto-complete
  "Instance Field.

  type: java.lang.String[]"
  ([^ClientCommandHandler this]
    (-> this .-latestAutoComplete)))

(defn execute-command
  "sender - `net.minecraft.command.ICommandSender`
  message - `java.lang.String`

  returns: 1 if successfully executed, -1 if no permission or wrong usage,
           0 if it doesn't exist or it was canceled (it's sent to the server) - `int`"
  (^Integer [^ClientCommandHandler this ^net.minecraft.command.ICommandSender sender ^java.lang.String message]
    (-> this (.executeCommand sender message))))

(defn auto-complete
  "left-of-cursor - `java.lang.String`"
  ([^ClientCommandHandler this ^java.lang.String left-of-cursor]
    (-> this (.autoComplete left-of-cursor))))

