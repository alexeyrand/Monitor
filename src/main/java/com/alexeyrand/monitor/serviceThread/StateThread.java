package com.alexeyrand.monitor.serviceThread;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class StateThread {

    private boolean startFlag = true;
    private boolean stopFlag = false;
    boolean stopWD = false;
}
