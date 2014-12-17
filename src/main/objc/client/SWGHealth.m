#import "SWGDate.h"
#import "SWGHealth.h"

@implementation SWGHealth

-(id)liveThreadCount: (NSNumber*) liveThreadCount
    peakThreadCount: (NSNumber*) peakThreadCount
    startedThreadCount: (NSNumber*) startedThreadCount
    daemonThreadCount: (NSNumber*) daemonThreadCount
    memory: (SWGMemory*) memory
{
  _liveThreadCount = liveThreadCount;
  _peakThreadCount = peakThreadCount;
  _startedThreadCount = startedThreadCount;
  _daemonThreadCount = daemonThreadCount;
  _memory = memory;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _liveThreadCount = dict[@"liveThreadCount"]; 
        _peakThreadCount = dict[@"peakThreadCount"]; 
        _startedThreadCount = dict[@"startedThreadCount"]; 
        _daemonThreadCount = dict[@"daemonThreadCount"]; 
        id memory_dict = dict[@"memory"];
        if(memory_dict != nil)
            _memory = [[SWGMemory alloc]initWithValues:memory_dict];
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_liveThreadCount != nil) dict[@"liveThreadCount"] = _liveThreadCount ;
        if(_peakThreadCount != nil) dict[@"peakThreadCount"] = _peakThreadCount ;
        if(_startedThreadCount != nil) dict[@"startedThreadCount"] = _startedThreadCount ;
        if(_daemonThreadCount != nil) dict[@"daemonThreadCount"] = _daemonThreadCount ;
        if(_memory != nil){
        if([_memory isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGMemory *memory in (NSArray*)_memory) {
                [array addObject:[(SWGObject*)memory asDictionary]];
            }
            dict[@"memory"] = array;
        }
        else if(_memory && [_memory isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_memory toString];
            if(dateString){
                dict[@"memory"] = dateString;
            }
        }
        else {
        if(_memory != nil) dict[@"memory"] = [(SWGObject*)_memory asDictionary];
        }
    }
    NSDictionary* output = [dict copy];
    return output;
}

@end

