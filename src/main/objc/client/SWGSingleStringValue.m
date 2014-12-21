#import "SWGDate.h"
#import "SWGSingleStringValue.h"

@implementation SWGSingleStringValue

-(id)value: (NSString*) value
{
  _value = value;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _value = dict[@"value"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_value != nil) dict[@"value"] = _value ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

