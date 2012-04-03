#!/bin/bash
# Copyright 2012 Citrix Systems, Inc. Licensed under the
# Apache License, Version 2.0 (the "License"); you may not use this
# file except in compliance with the License.  Citrix Systems, Inc.
# reserves all rights not expressly granted by the License.
# You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
# 
# Automatically generated by addcopyright.py at 04/03/2012
 
 
usage() {
  printf "Query job result Usage: %s: -h management-server -j jobid\n" $(basename $0) >&2
}

#options
jflag=
hflag=

jobid=
host="127.0.0.1" #defaults to localhost

while getopts 'h:j:' OPTION
do
 case $OPTION in
  h)	hflag=1
        host="$OPTARG"
        ;;
  j)    jflag=1
        jobid="$OPTARG"
        ;;
  ?)	usage
		exit 2
		;;
  esac
done

if [ $jflag != "1" ]
then
 usage
 exit 2
fi


job_query="GET  http://$host:8096/client/?command=queryAsyncJobResult&jobid=$jobid	HTTP/1.0\n\n"
echo -e $job_query | nc -v -w 60 $host 8096
